/*
 * This file is part of JOrbis.
 *
 * Copyright © 2000, JCraft Inc.
 * JOrbis is licensed under the GNU Lesser General Public License.
 *
 * JOrbis is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JOrbis is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * Many thanks to Monty <monty@xiph.org> and The XIPHOPHORUS Company <http://www.xiph.org/>.
 * JOrbis has been based on their awesome works, Vorbis codec.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jcraft.jorbis;

import com.jcraft.jogg.Buffer;

abstract class FuncResidue
{
	public static FuncResidue[] residue_P = { new Residue0(), new Residue1(), new Residue2() };
	
	abstract void pack( Object vr, Buffer opb );
	
	abstract Object unpack( Info vi, Buffer opb );
	
	abstract Object look( DspState vd, InfoMode vm, Object vr );
	
	abstract void free_info( Object i );
	
	abstract void free_look( Object i );
	
	abstract int inverse( Block vb, Object vl, float[][] in, int[] nonzero, int ch );
}