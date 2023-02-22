/*
 *   ExplodingAUTest - A testing program for ExplodingAU.
 *   Copyright (C) 2023  ExplodingBottle
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.github.explodingbottle.explodingautest;

import javax.swing.JOptionPane;

import io.github.explodingbottle.explodingau.ExplodingAULib;

public class Main {

	public static void main(String[] args) {
		ExplodingAULib.standardProgramRoutine("EAUTest");
		JOptionPane.showMessageDialog(null, "Hello V1.0 !", "V1.0", JOptionPane.INFORMATION_MESSAGE);
	}

}
