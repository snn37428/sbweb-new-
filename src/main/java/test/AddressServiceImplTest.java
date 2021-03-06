package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import shop.pojo.Auc;
import shop.service.AddressService;
import shop.service.GoodsService;
import shop.serviceImpl.AddressServiceImpl;
import shop.serviceImpl.LoginServiceImpl;

import javax.annotation.Resource;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-config.xml"})
public class AddressServiceImplTest {

    private static final Logger logger = Logger.getLogger(AddressServiceImplTest.class);

    @Resource(name = "AddressServiceImpl")
    private AddressService addressService;

    @Resource(name = "LoginServiceImpl")
    private LoginServiceImpl loginServiceImpl;

    @Resource(name = "GoodsSerivceImpl")
    private GoodsService goodsService;

    @Test
    public void tset(){

        logger.error("--------------");
        logger.info("1111111111111111111111111");
        logger.debug("22222222222");

//     addressService.insertAddress();

//        Auc auc = new Auc();
//        auc.setOpendId("0");
//        Map sef = addressService.detail(auc);



//        Map se = loginServiceImpl.getSession("071pppZG16qS270A9x0H15rJZG1pppZ6");

          goodsService.productList(5l);

    }

}