package online_store_app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("online_store_app.services")
@ComponentScan("online_store_app.dao")
public class AppConfiguration {
}
