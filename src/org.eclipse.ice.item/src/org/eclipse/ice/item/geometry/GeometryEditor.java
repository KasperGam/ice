/*******************************************************************************
 * Copyright (c) 2012, 2014 UT-Battelle, LLC.
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
package org.eclipse.ice.item.geometry;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.ice.datastructures.form.Form;
import org.eclipse.ice.datastructures.form.geometry.GeometryComponent;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.ItemType;
import org.eclipse.core.resources.IProject;

/**
 * <p>
 * This is a subclass of Item that provides 3D geometry editing services to ICE.
 * It overrides the setupForm() operation and provides a Form that contains a
 * GeometryComponent. More information about the exact contents of the Form is
 * available on the setupForm() operation description below.
 * </p>
 * 
 * @author Jay Jay Billings
 */
@XmlRootElement(name = "GeometryEditor")
public class GeometryEditor extends Item {
	/**
	 * <p>
	 * An alternative nullary constructor used primarily for serialization. The
	 * setProject() operation must be called if this constructor is used!
	 * </p>
	 * 
	 */
	public GeometryEditor() {

		// Punt to the other Constructor
		this(null);

	}

	/**
	 * <p>
	 * The constructor.
	 * </p>
	 * 
	 * @param project
	 *            <p>
	 *            The Eclipse project used by the GeometryEditor.
	 *            </p>
	 */
	public GeometryEditor(IProject project) {

		// Call the super constructor
		super(project);

		// Remove the action from the list that allows for writing key-value
		// pairs to a file. The GeometryComponent in the Form can't be written
		// like that.
		allowedActions.remove(taggedExportActionString);

		return;
	}

	/**
	 * <p>
	 * This operation overrides setupForm() to provide a Form that contains a
	 * single GeometryComponent. This component has id=1 and is named
	 * "Geometry Data."
	 * </p>
	 * 
	 */
	protected void setupForm() {

		// Set the name, description and type
		setName("Geometry Editor");
		itemType = ItemType.Geometry;
		setDescription("This tool allows you to create and edit a 3D geometry.");

		// Instantiate the Form. It's just a regular Form for this Item.
		form = new Form();

		// Create a GeometryComponent to hold the Geometry
		GeometryComponent geometryComp = new GeometryComponent();
		geometryComp.setName("Geometry Data");
		geometryComp.setId(1);
		geometryComp.setDescription(getDescription());

		// Add the component to the Form
		form.addComponent(geometryComp);

		return;

	}
}