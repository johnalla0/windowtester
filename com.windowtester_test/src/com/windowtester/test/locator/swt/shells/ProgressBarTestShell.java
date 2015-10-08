/*******************************************************************************
 *  Copyright (c) 2015 Phillip Jensen
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Phillip Jensen - initial API and implementation
 *******************************************************************************/
package com.windowtester.test.locator.swt.shells;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;

public class ProgressBarTestShell {

	protected Shell shell;
	
	/**
	 * Open the window
	 */
	public void open() {
		shell = new Shell();
		createContents();
		shell.setSize (250, 250);
		shell.open ();
		shell.layout();
		shell.pack();
		shell.setVisible(true);
	}	
	
	private void createContents() {
		ProgressBar progressBar = new ProgressBar(shell, SWT.HORIZONTAL);
		progressBar.setBounds(0, 0, 120, 15);
		progressBar.setMinimum(1);
		progressBar.setMaximum(50);
		progressBar.setSelection(30);
		progressBar.pack();
	}

	public Shell getShell() {
		return shell;
	}
	
	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String[] args) {
		try {
	 		SliderTestShell window = new SliderTestShell();
			window.open();
	 			
 			final Display display = Display.getDefault();
	 		while (!window.getShell().isDisposed()) {
	 			if (!display.readAndDispatch())
					display.sleep();
	 		}
	 	} catch (Exception e) {
	 		e.printStackTrace();
	 	}
	}
}
