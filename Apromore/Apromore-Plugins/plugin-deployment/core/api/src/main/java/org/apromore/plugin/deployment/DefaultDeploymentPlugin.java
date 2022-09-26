/*
 * Copyright © 2009-2014 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package org.apromore.plugin.deployment;

import org.apromore.plugin.DefaultParameterAwarePlugin;

/**
 * Default implementation of the Deployment Plugin.
 *
 * @author <a href="mailto:felix.mannhardt@smail.wir.h-brs.de">Felix Mannhardt</a>
 *
 */
public abstract class DefaultDeploymentPlugin extends DefaultParameterAwarePlugin implements DeploymentPlugin {

    /*
     * (non-Javadoc)
     *
     * @see org.apromore.plugin.deployment.DeploymentPlugin#getNativeType()
     */
    @Override
    public String getNativeType() {
        return getConfigurationByName("deployment.nativeType");
    }

}