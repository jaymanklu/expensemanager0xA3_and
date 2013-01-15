package noncom.jay.xA3;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class EMDbInterface extends SQLiteOpenHelper {
	Context context;
	private final String TAG = "EMDbInterface";
	public EMDbInterface(Context context) {
		super(context,EMContract.DB_NAME,null,EMContract.DB_VER);
		this.context = context;
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		String sqlMonthTable = "create table " + EMContract.EMMonthTable.TABLE + " (" + EMContract.EMMonthTable.MONTH_ID + " int primary key, " + EMContract.EMMonthTable.MONTH + " text, " + EMContract.EMMonthTable.YR + " int)";
		String sqlSalaryTable = "create table " + EMContract.EMSalaryTable.TABLE + " (" + EMContract.EMSalaryTable.SAL_ID + " int primary key, " + EMContract.EMSalaryTable.SAL_MONTH + " text, " + EMContract.EMSalaryTable.SAL_YR + " int, " + EMContract.EMSalaryTable.SAL_TIMESTMP + " text, " + EMContract.EMSalaryTable.SAL_REMARK + " text, " + EMContract.EMSalaryTable.SAL_AMOUNT + "int)";
		String sqlAddICTable = "create table " + EMContract.EMAddICTable.TABLE + " (" + EMContract.EMAddICTable.ADDIC_ID + " int primary key, " + EMContract.EMAddICTable.ADDIC_MONTH + " text, " + EMContract.EMAddICTable.ADDIC_YR + " int, " + EMContract.EMAddICTable.ADDIC_TIMESTMP + " text, " + EMContract.EMAddICTable.ADDIC_REMARK + " text, " + EMContract.EMAddICTable.ADDIC_AMOUNT + "int)";
		String sqlDebtTable = "create table " + EMContract.EMDebtTable.TABLE + " (" + EMContract.EMDebtTable.DEB_ID + " int primary key, " + EMContract.EMDebtTable.DEB_MONTH + " text, " + EMContract.EMDebtTable.DEB_YR + " int, " + EMContract.EMDebtTable.DEB_REMARK + " text, " + EMContract.EMDebtTable.DEB_AMOUNT + "int)";
		String sqlExpenseTable = "create table " + EMContract.EMExpenseTable.TABLE + " (" + EMContract.EMExpenseTable.EXP_ID + " int primary key, " + EMContract.EMExpenseTable.EXP_MONTH + " text, " + EMContract.EMExpenseTable.EXP_YR + " int, " + EMContract.EMExpenseTable.EXP_TIMESTMP + " text, " + EMContract.EMExpenseTable.EXP_REMARK + " text, " + EMContract.EMExpenseTable.EXP_AMOUNT + "int)";
		String sqlSavingTable = "create table " + EMContract.EMSavingTable.TABLE + " (" + EMContract.EMSavingTable.SV_ID + " int primary key, " + EMContract.EMSavingTable.SV_MONTH + " text, " + EMContract.EMSavingTable.SV_YR + " int, " + EMContract.EMSavingTable.SV_REMARK + " text, " + EMContract.EMSavingTable.SV_AMOUNT + "int)";
		
		try {
			db.execSQL(sqlMonthTable);
			db.execSQL(sqlSalaryTable);
			db.execSQL(sqlAddICTable);
			db.execSQL(sqlDebtTable);
			db.execSQL(sqlExpenseTable);
			db.execSQL(sqlSavingTable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.e(TAG,"Table Creation Error");
		}
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		try {
			db.execSQL("drop table if exists " + EMContract.EMMonthTable.TABLE);
			db.execSQL("drop table if exists " + EMContract.EMSalaryTable.TABLE);
			db.execSQL("drop table if exists " + EMContract.EMAddICTable.TABLE);
			db.execSQL("drop table if exists " + EMContract.EMDebtTable.TABLE);
			db.execSQL("drop table if exists " + EMContract.EMExpenseTable.TABLE);
			db.execSQL("drop table if exists " + EMContract.EMSavingTable.TABLE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.e(TAG,"Table Deletion Error");
		}
		onCreate(db);
	}
	
	public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	        onUpgrade(db, oldVersion, newVersion);
	 }

}
