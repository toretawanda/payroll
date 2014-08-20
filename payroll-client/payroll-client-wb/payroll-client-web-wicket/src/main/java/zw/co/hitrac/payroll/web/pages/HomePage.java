package zw.co.hitrac.payroll.web.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author tore tawanda
 */
public class HomePage extends WebPage {

    public HomePage(PageParameters parameters) {
        super(parameters);

        add(new Label("version", "1.0.0"));

    }
}