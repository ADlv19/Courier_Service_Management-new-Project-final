package com.base.dao;

import com.base.models.CustomerInfo;
import com.base.models.OrderDetails;
import com.base.models.Product;

public interface CustomerDAOInterface {
    
    boolean addCustomerToDB(CustomerInfo csi);
    
    boolean addOrderDetailsToDB(CustomerInfo csi, Product product);
    
    Integer getOrderIDFromDB(CustomerInfo csi, Product product);
    
    boolean addSenderDetailsToDB(CustomerInfo csi, OrderDetails sender);
    
    boolean addReceiverDetailsToDB(CustomerInfo csi, OrderDetails receiver);
    
    CustomerInfo findCustomerByEmailID(String emailID);
    
    boolean checkIfMailAlreadyRegistered(String emailID);
    
    boolean updateCustomerDetails(CustomerInfo customerInfo);
    
    Object[][] getPreviousOrderDetails(Integer customerID);
}
