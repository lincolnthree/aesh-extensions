package org.jboss.aesh.extensions.page;

import java.io.IOException;
import java.util.List;

/**
 * @author <a href="mailto:stale.pedersen@jboss.org">Ståle W. Pedersen</a>
 */
public interface PageLoader {

    public List<String> loadPage(int columns) throws IOException;

    public String getResourceName();
}
