package ibf2022.ssf.day12workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibf2022.ssf.day12workshop.model.Item;
import ibf2022.ssf.day12workshop.repository.ItemRepo;

@Service
public class ItemService {
    
    @Autowired
    ItemRepo itmRepo;

    public List<Item> retrieveItemList() {
        return itmRepo.getCartItems();
    }
}
