package twolak.springframework.stwdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import twolak.springframework.stwdi.examplebeans.FakeDataSource;
import twolak.springframework.stwdi.examplebeans.FakeJmsBroker;

/**
 * @author twolak
 *
 */
@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
//@PropertySources({ 
//	@PropertySource("classpath:datasource.properties"),
//	@PropertySource("classpath:jms.properties") 
//	})
public class PropertyConfig {

//    @Autowired
//    private Environment env;

    @Value("${tw.username}")
    private String user;

    @Value("${tw.password}")
    private String password;

    @Value("${tw.url}")
    private String url;

    @Value("${tw.jms.username}")
    private String jmsUser;

    @Value("${tw.jms.password}")
    private String jmsPassword;

    @Value("${tw.jms.url}")
    private String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
	FakeDataSource fakeDataSource = new FakeDataSource();
	fakeDataSource.setUser(user);
	fakeDataSource.setPassword(password);
	fakeDataSource.setUrl(url);
	return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
	FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
	fakeJmsBroker.setUsername(jmsUser);
	fakeJmsBroker.setPassword(password);
	fakeJmsBroker.setUrl(url);
	return fakeJmsBroker;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//	PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//	return propertySourcesPlaceholderConfigurer;
//    }
}
