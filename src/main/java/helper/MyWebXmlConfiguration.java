package helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebXmlConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] b= {MyConfiguration.class};
		return b;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[]a= {"/"};
		return a;
	}

}
