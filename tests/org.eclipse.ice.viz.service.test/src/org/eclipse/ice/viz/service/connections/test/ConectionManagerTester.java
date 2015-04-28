package org.eclipse.ice.viz.service.connections.test;

import org.eclipse.ice.client.widgets.viz.service.IVizService;
import org.eclipse.ice.viz.service.connections.ConnectionManager;
import org.eclipse.ice.viz.service.connections.IConnectionAdapter;
import org.eclipse.ice.viz.service.connections.IConnectionClient;
import org.junit.Ignore;
import org.junit.Test;

/**
 * This class tests the {@link ConnectionManager} that is used by some
 * {@link IVizService}s to map their connections (stored as
 * {@link IConnectionAdapter}s) to their plots (stored as
 * {@link IConnectionClient}s).
 * 
 * @author Jordan Deyton
 *
 */
@Ignore
public class ConectionManagerTester {
	// TODO Implement these tests.

	/**
	 * This test checks the default state of a {@code ConnectionAdapter} after
	 * construction.
	 */
	@Test
	public void checkConstruction() {

	}

	/**
	 * This checks that the adapters managed by this class can be properly
	 * connected.
	 */
	@Test
	public void checkConnect() {

	}

	/**
	 * This checks that the adapters managed by this class can be properly
	 * disconnected.
	 */
	@Test
	public void checkDisconnect() {

	}

	/**
	 * This checks that connection clients can be added or removed and that they
	 * are properly registered with the associated connection adapter.
	 */
	@Test
	public void checkClients() {

	}

	/**
	 * This method checks that the underlying adapter is properly updated based
	 * on the changed preferences.
	 */
	@Test
	public void checkPreferences() {

	}
}
