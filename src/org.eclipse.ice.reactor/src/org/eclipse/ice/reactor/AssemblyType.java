/*******************************************************************************
 * Copyright (c) 2013, 2014 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Initial API and implementation and/or initial documentation - Jay Jay Billings,
 *   Jordan H. Deyton, Dasha Gorin, Alexander J. McCaskey, Taylor Patterson,
 *   Claire Saunders, Matthew Wang, Anna Wojtowicz
 *******************************************************************************/
package org.eclipse.ice.reactor;

/**
 * <p>
 * An enumeration of all of the nuclear reactor assembly types supported by this
 * package.
 * </p>
 * 
 * @author Jay Jay Billings
 */
public enum AssemblyType {
	/**
	 * <p>
	 * ﻿Nuclear fuel components, purchased from fuel vendors and shuffled around
	 * each fuel cycle. A typical fuel assembly is loaded fresh with either
	 * integral or discrete burnable absorbers, is operated for three fuel
	 * cycles in a different core location each cycle, and is discharged to the
	 * spent fuel pool one a substantial amount of its initial fissile material
	 * is depleted.
	 * </p>
	 * 
	 */
	Fuel,
	/**
	 * <p>
	 * A control bank used to regulate the power within the reactor.
	 * </p>
	 * 
	 */
	ControlBank,
	/**
	 * <p>
	 * ﻿Used for power distribution monitoring inside of the reactor core.
	 * Typically there are movable fission chambers that create electronic
	 * signals from neutron flux fields. Incore detectors have to be replaced as
	 * needed, when their sensitivity decreases substantially due to depletion
	 * of the fissile material.
	 * </p>
	 * 
	 */
	IncoreInstrument,
	/**
	 * <p>
	 * ﻿Clusters of (typically neutron absorbing) rods when are placed in and
	 * moved between fuel assemblies during refueling outages.
	 * </p>
	 * 
	 */
	RodCluster
}