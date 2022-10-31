package com.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemo")

//Burada xml dosyası yerine classlarla çalışmak için kullanılan modern spring yapısıdır.
//burda yapmamız gereken main dosyasına artık classla çalıştığımızı belirtmemiz gerekir
public class IocConfig {

}
