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

    // Without AutoWired, you will have to call the constructor below.

    // public ItemService() {
    //     itmRepo = new ItemRepo();
    // }

    public List<Item> retrieveItemList() {
        return itmRepo.getCartItems();
    }
}
