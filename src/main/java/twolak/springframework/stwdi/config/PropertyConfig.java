package twolak.springframework.stwdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import twolak.springframework.stwdi.examplebeans.FakeDataSource;

/**
 * @author twolak
 *
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    
    @Value("${dbconn.username}")
    private String user;
    
    @Value("${dbconn.password}")
    private String password;
    
    @Value("${dbconn.url}")
    private String url;
    
    @Bean
    public FakeDataSource fakeDataSource() {
	FakeDataSource fakeDataSource = new FakeDataSource();
	fakeDataSource.setUser(user);
	fakeDataSource.setPassword(password);
	fakeDataSource.setUrl(url);
	return fakeDataSource;
    }
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
	PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
	return propertySourcesPlaceholderConfigurer;
    }
}
