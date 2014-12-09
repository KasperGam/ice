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
package org.eclipse.ice.viz.visit;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.IOConsole;

/**
 * @author Taylor Patterson
 * 
 */
public class VisitPythonConsole extends IOConsole {

	/**
	 * The constructor
	 * 
	 * @see IOConsole(String, ImageDescriptor)
	 * 
	 * @param name
	 *            The name to display for this console
	 * @param imageDescriptor
	 *            The image to display for this console or <code>null</code>
	 */
	public VisitPythonConsole(String name, ImageDescriptor imageDescriptor) {
		super(name, imageDescriptor);
	}

	/**
	 * Execute the most recent user input in the this console. Parse the text in
	 * the console to grab the most recent command and send it off to the VisIt
	 * client.
	 */
	protected void executeCommand() {

		// // Get the last command from the console Text
		// String command = console.getText().trim();
		// int start = Math.max(0, command.lastIndexOf("\n"));
		// command = command.substring(start);
		// // Call the VisIt widget method to process the command(s)
		// if (!command.isEmpty()) {
		// widget.getViewerMethods().processCommands(command);
		// }

		return;
	}
}
