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
import com.jcraft.jorbis.Mapping0.InfoMapping0;
import com.jcraft.jorbis.Mapping0.LookMapping0;

abstract class FuncMapping
{
	public static FuncMapping[] mapping_P = { new Mapping0() };
	
	abstract void pack( Info info, InfoMapping0 imap, Buffer buffer );
	
	abstract InfoMapping0 unpack( Info info, Buffer buffer );
	
	abstract LookMapping0 look( DspState vd, InfoMode vm, InfoMapping0 m );
	
	abstract void free_info( InfoMapping0 imap );
	
	abstract void free_look( InfoMapping0 imap );
	
	abstract int inverse( Block vd, Object lm );
}
