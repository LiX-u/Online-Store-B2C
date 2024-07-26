package com.lixv.onlinemall.product;

//import com.lixv.onlinemall.product.entity.BrandEntity;
//import com.lixv.onlinemall.product.service.BrandService;
import com.lixv.onlinemall.product.entity.BrandEntity;
import com.lixv.onlinemall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	public void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();

		brandEntity.setName("华为");

		brandService.save(brandEntity);
		System.out.println("保存成功");


	}

}
