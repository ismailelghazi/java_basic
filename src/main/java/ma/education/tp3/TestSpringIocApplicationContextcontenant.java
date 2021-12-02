package ma.education.tp3;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ma.education.tp3.Client;
public class TestSpringIocApplicationContextcontenant {
    public static void main(String[] args) {
    ApplicationContext appContext=new AbstractApplicationContext() {
        @Override
        protected void refreshBeanFactory() throws BeansException, IllegalStateException {

        }

        @Override
        protected void closeBeanFactory() {

        }

        @Override
        public ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException {
            return null;
        }
    };
        new ClassPathXmlApplicationContext("spring.xml");
        Client client = (Client ) appContext.getBean("clt");
    }

}
