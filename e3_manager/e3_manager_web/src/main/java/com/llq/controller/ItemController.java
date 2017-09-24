package com.llq.controller;

import com.llq.pojo.TbItem;
import com.llq.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
       @Autowired
       private ItemService itemService;
       @RequestMapping("/item/{itemId}")
       @ResponseBody
       public TbItem getItemById( @PathVariable  Long  itemId){
           TbItem item = itemService.getItemById(itemId);

             return item;
       }



}
