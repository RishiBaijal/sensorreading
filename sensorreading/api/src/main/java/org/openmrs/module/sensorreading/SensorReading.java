/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.sensorreading;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Concept;
import org.openmrs.ConceptAnswer;
import org.openmrs.Encounter;
import org.openmrs.EncounterRole;
import org.openmrs.EncounterType;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.Person;
import org.openmrs.Provider;
import org.openmrs.api.context.Context;
import org.openmrs.module.sensorreading.api.SensorConceptMappingService;

/**
 * It is a model class. It should extend either {@link BaseOpenmrsObject} or {@link BaseOpenmrsMetadata}.
 */

/**
 * Model class for sensor reading.
 * @author rakshit
 *
 */
public class SensorReading extends BaseOpenmrsData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer encounter_id;
	private SensorMapping sensor;
	private Obs observation;
	private Patient patient;
	private Encounter encounter;
	private Date date;
	
	public SensorReading(){
		System.out.println("SensorReading() Constructor here");
	}
	
	public SensorReading(Integer encounter_id,SensorMapping sensor,Obs observation,Patient patient,Encounter encounter,Date date){
		System.out.println("SensorReading(with params) Constructor here with Encounter id="+encounter_id);
		setEncounter_id(encounter_id);
		setSensor(sensor);
		setObservation(observation);
		setPatient(patient);
		setEncounter(encounter);
		setDate(date);
	}
	
	public Encounter getEncounter() {
		return encounter;
	}
	public SensorReading(){
		//Empty constructor
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	public Integer getEncounter_id() {
		return encounter_id;
	}
	public void setEncounter_id(Integer encounter_id) {
		this.encounter_id = encounter_id;
	}
	public Obs getObservation() {
		return observation;
	}
	public void setObservation(Obs observation) {
		this.observation = observation;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	public SensorMapping getSensor() {
		return sensor;
	}
	public void setSensor(SensorMapping sensor) {
		this.sensor = sensor;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}