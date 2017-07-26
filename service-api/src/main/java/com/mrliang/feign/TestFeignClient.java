package com.mrliang.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-B",fallback = TestFeignClient.HystrixClientFallback.class)
public interface TestFeignClient {

  @RequestMapping("/add")
  public String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
  @RequestMapping("/testServiceA")
  public String testServiceB(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
  @Component
  static class HystrixClientFallback implements TestFeignClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

	@Override
	public String add(Integer a, Integer b) {
		HystrixClientFallback.LOGGER.info("异常发生11123，进入fallback方法，接收的参数12331： {},{}",a,b);
		return "feign-hystrix-----:"+(a+b);
	}

      @Override
      public String testServiceB(Integer a, Integer b) {
          HystrixClientFallback.LOGGER.info("testServiceB异常发生，进入fallback方法，接收的参数12331： {},{}",a,b);
          return "feign-hystrix111--errror:"+(a+b);
      }
  }
}
