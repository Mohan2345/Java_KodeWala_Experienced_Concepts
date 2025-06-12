package com.reddis.config;

import java.time.Duration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration.JedisClientConfigurationBuilder;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
@EnableCaching
@ComponentScan(basePackages =  "com.reddis")
public class ReddisConfig 
{
	@Bean
	public JedisConnectionFactory jedisConnectionFactory()
	{
		RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
		redisConfig.setHostName("relieved-skylark-48721.upstash.io"); // e.g.// us1-yourdb.upstash.io
																	
		redisConfig.setPort(6379);
		redisConfig.setPassword(RedisPassword.of("Ab5RAAIjcDFmZTZlZTQwYjUzOTE0OWYzYmVmNWUzYjYzMTEzNWI1YnAxMA"));

		JedisClientConfiguration clientConfig = ((JedisClientConfigurationBuilder) JedisClientConfiguration.builder()
				.useSsl() // Upstash requires SSL
		).readTimeout(Duration.ofSeconds(10)).connectTimeout(Duration.ofSeconds(10)).build();

		return new JedisConnectionFactory(redisConfig, clientConfig);
	}

	@Bean
	public StringRedisTemplate redisTemplate()
	{
		return new StringRedisTemplate(jedisConnectionFactory());
	}

	@Bean
	public CacheManager cacheManager(RedisConnectionFactory factory)
	{
		// After 100 seconds all the key was removed from Reddis
		RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(100)); // TTL FOR CACHED ITEMS
																														 
		return RedisCacheManager.builder(factory).cacheDefaults(config).build();
	}
}
