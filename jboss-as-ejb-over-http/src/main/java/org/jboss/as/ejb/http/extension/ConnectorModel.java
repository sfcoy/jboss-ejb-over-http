/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.as.ejb.http.extension;

import org.jboss.dmr.ModelNode;

/**
 * Attributes used by the connector {@link org.jboss.dmr.ModelNode}s
 * @author sfcoy
 */
final class ConnectorModel {

    static final String NAME = "connector";

    static final String CONTEXT_ATTR = "context";

    static final String VIRTUAL_HOST_ATTR = "virtual-host";

    static final String SECURITY_DOMAIN_ATTR = "security-domain";

    static final String DEFAULT_HOST = "default-host";

    static final ModelNode DEFAULT_VIRTUAL_HOST = new ModelNode(DEFAULT_HOST);

}
