package com.lindacare.messageprocessor.controller;

import com.lindacare.messageprocessor.dao.MarketModel;
import com.lindacare.messageprocessor.dao.MarketModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = {"http://localhost:9001"})
public class MessageProcessorRestController {
    private static final int PAGINATION_SIZE=20;

    @Autowired
    private MarketModelRepository marketModelRepository;

    @RequestMapping(value="/findAll/{page}" , method= RequestMethod.GET)
    public Page<MarketModel> findAll(@PathVariable("page") int page) {
        return marketModelRepository.findAll(PageRequest.of(page, PAGINATION_SIZE, Sort.Direction.DESC, "timePlaced"));
    }
}
