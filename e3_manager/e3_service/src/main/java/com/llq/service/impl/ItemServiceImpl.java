package com.llq.service.impl;

import com.llq.mapper.TbItemMapper;
import com.llq.pojo.TbItem;
import com.llq.pojo.TbItemExample;
import com.llq.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(Long id) {
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<TbItem> list = tbItemMapper.selectByExample(example);
        if (list!=null && list.size()>0){
            TbItem tbItem = list.get(0);
            return tbItem;
        }
        return null;
    }
}
