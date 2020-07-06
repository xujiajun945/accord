package com.xujiajun.accord.business.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {

	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		FastJsonHttpMessageConverter messageConverter = new FastJsonHttpMessageConverter();
		messageConverter.setDefaultCharset(StandardCharsets.UTF_8);

		List<MediaType> mediaTypeList = new ArrayList<>();
		mediaTypeList.add(MediaType.TEXT_HTML);
		mediaTypeList.add(MediaType.APPLICATION_JSON);
		messageConverter.setSupportedMediaTypes(mediaTypeList);

		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setCharset(StandardCharsets.UTF_8);
		fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteNullListAsEmpty, SerializerFeature.PrettyFormat);
		messageConverter.setFastJsonConfig(fastJsonConfig);

		converters.add(messageConverter);
	}
}
