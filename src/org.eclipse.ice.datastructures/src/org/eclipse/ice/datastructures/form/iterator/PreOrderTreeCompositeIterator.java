package org.eclipse.ice.datastructures.form.iterator;

import java.util.Stack;

import org.eclipse.ice.datastructures.form.TreeComposite;

/**
 * This class implements a pre-order traversal for a {@link TreeComposite}. To
 * use this, instantiate it with a root TreeComposite and use the standard
 * iterator commands, e.g.:
 * 
 * <pre>
 * <code>
 * TreeComposite root;
 * // Set up your tree here...
 * 
 * Iterator<TreeComposite> iterator = new PreOrderTreeCompositeIterator(root);
 * while (iterator.hasNext()) {
 *     TreeComposite child = iterator.next();
 * 
 *     // Do something with the child tree here...
 * }
 * </code>
 * </pre>
 * 
 * @author Jordan H. Deyton
 * 
 */
public class PreOrderTreeCompositeIterator extends
		AbstractTreeCompositeIterator {

	/**
	 * A stack used to maintain state information about the position of the
	 * iterator. If empty, there is no remaining TreeComposite to visit.
	 */
	private final Stack<TreeComposite> stack;

	/**
	 * The default constructor.
	 * 
	 * @param root
	 *            The root TreeComposite that is the starting point for this
	 *            iterator.
	 */
	public PreOrderTreeCompositeIterator(TreeComposite root) {

		// Call the super constructor. Send a non-null root TreeComposite. We
		// must make sure this class is completely initialized before throwing
		// an exception for a null argument.
		super((root != null ? root : new TreeComposite()));

		// Create a new, empty stack.
		stack = new Stack<TreeComposite>();

		// If the root TreeComposite is not null, it is the first element to
		// iterate over.
		if (root != null) {
			stack.push(root);
		}
		// Otherwise, now that the class is initialized, we can throw an
		// exception for a null argument.
		else {
			throw new IllegalArgumentException(
					"PreOrderTreeCompositeIterator error: "
							+ "Root cannot be null.");
		}

		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ice.datastructures.form.TreeCompositeIterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ice.datastructures.form.TreeCompositeIterator#next()
	 */
	@Override
	public TreeComposite next() {

		// Set the default return value.
		TreeComposite next = super.next();

		// If we have a TreeComposite to iterate over, proceed.
		next = stack.pop();
		for (int i = next.getNumberOfChildren() - 1; i >= 0; i--) {
			stack.push(next.getChildAtIndex(i));
		}

		return next;
	}

}
