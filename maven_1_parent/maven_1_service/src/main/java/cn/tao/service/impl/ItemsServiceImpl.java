package cn.tao.service.impl;

import cn.tao.domain.Items;
import cn.tao.mapper.ItemsMapper;
import cn.tao.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }

}
