package com.skypro.product.repository;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class ProductRepository {

private final List<Integer> idList= new ArrayList<>();

public void addProduct(List<Integer> ids){
    idList.addAll(ids);
}

public List<Integer> getAllProduct(){
    return  this.idList;
}

}
