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

// psychoacoustic setup
class PsyInfo
{
	int athp;
	int decayp;
	int smoothp;
	int noisefitp;
	int noisefit_subblock;
	float noisefit_threshdB;
	
	float ath_att;
	
	int tonemaskp;
	float[] toneatt_125Hz = new float[5];
	float[] toneatt_250Hz = new float[5];
	float[] toneatt_500Hz = new float[5];
	float[] toneatt_1000Hz = new float[5];
	float[] toneatt_2000Hz = new float[5];
	float[] toneatt_4000Hz = new float[5];
	float[] toneatt_8000Hz = new float[5];
	
	int peakattp;
	float[] peakatt_125Hz = new float[5];
	float[] peakatt_250Hz = new float[5];
	float[] peakatt_500Hz = new float[5];
	float[] peakatt_1000Hz = new float[5];
	float[] peakatt_2000Hz = new float[5];
	float[] peakatt_4000Hz = new float[5];
	float[] peakatt_8000Hz = new float[5];
	
	int noisemaskp;
	float[] noiseatt_125Hz = new float[5];
	float[] noiseatt_250Hz = new float[5];
	float[] noiseatt_500Hz = new float[5];
	float[] noiseatt_1000Hz = new float[5];
	float[] noiseatt_2000Hz = new float[5];
	float[] noiseatt_4000Hz = new float[5];
	float[] noiseatt_8000Hz = new float[5];
	
	float max_curve_dB;
	
	float attack_coeff;
	float decay_coeff;
	
	void free()
	{
	}
}
