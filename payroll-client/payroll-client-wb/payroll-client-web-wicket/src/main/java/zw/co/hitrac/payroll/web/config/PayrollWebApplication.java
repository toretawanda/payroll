package zw.co.hitrac.payroll.web.config;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import zw.co.hitrac.payroll.web.pages.HomePage;

/**
 *
 * @author tore tawanda
 */
public class PayrollWebApplication extends WebApplication{

    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }
}
