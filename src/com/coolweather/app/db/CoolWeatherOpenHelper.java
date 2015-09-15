package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	 *  Privince��������
	 */
	public static final String CREATE_PROVICE = "create table Privance ("
			+ "id integer primary key autoincrement, "
			+ "privince_name text, "
			+ "privince_code text) ";
	/**
	 * City�������
	 */
	public static final String CREATE_CITY = "create table City ("
			+ "id integer primary key autoincrement, "
			+ "city_name text, "
			+ "city_code text) ";
	/**
	 *  County�������
	 */
	public static final String CREATE_COUNTY = "create table County ("
			+ "id integer primary key autoincrement, "
			+ "county_name text, "
			+ "county_code text) ";
	
	public CoolWeatherOpenHelper (Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVICE);	//����PROVICE��
		db.execSQL(CREATE_CITY);	//����CITY��
		db.execSQL(CREATE_COUNTY);	//����COUNTY��
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
	
}