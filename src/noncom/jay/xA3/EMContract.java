package noncom.jay.xA3;

import android.provider.BaseColumns;

public class EMContract implements BaseColumns {
	public static final String DB_NAME = "EMdb.db";
	public static final int DB_VER = 1;
	private EMContract() {}
	public static abstract class EMMonthTable {
		public static final String TABLE = "Month_Table";
		public static final String MONTH_ID = BaseColumns._ID;
		public static final String MONTH = "Month";
		public static final String YR = "Year";
	}
	public static abstract class EMSalaryTable {
		public static final String TABLE = "Salary_Table";
		public static final String SAL_ID = BaseColumns._ID;
		public static final String SAL_MONTH = "Salary_Month";
		public static final String SAL_YR = "Salary_Year";
		public static final String SAL_TIMESTMP = "Salary_Timestamp";
		public static final String SAL_REMARK = "Salary_Remark";
		public static final String SAL_AMOUNT = "Salary_Amount";
	}
	public static abstract class EMAddICTable {
		public static final String TABLE = "AddIC_Table";
		public static final String ADDIC_ID = BaseColumns._ID;
		public static final String ADDIC_MONTH = "AddIC_Month";
		public static final String ADDIC_YR = "AddIC_Year";
		public static final String ADDIC_TIMESTMP = "AddIC_Timestamp";
		public static final String ADDIC_REMARK = "AddIC_Remark";
		public static final String ADDIC_AMOUNT = "AddIC_Amount";
	}
	public static abstract class EMExpenseTable {
		public static final String TABLE = "Expense_Table";
		public static final String EXP_ID = BaseColumns._ID;
		public static final String EXP_MONTH = "Expense_Month";
		public static final String EXP_YR = "Expense_Year";
		public static final String EXP_TIMESTMP = "Expense_Timestamp";
		public static final String EXP_REMARK = "Expense_Remark";
		public static final String EXP_AMOUNT = "Expense_Amount";
	}
	public static abstract class EMDebtTable {
		public static final String TABLE = "Debt_Table";
		public static final String DEB_ID = BaseColumns._ID;
		public static final String DEB_MONTH = "Debt_Month";
		public static final String DEB_YR = "Debt_Year";
		public static final String DEB_REMARK = "Debt_Remark";
		public static final String DEB_AMOUNT = "Debt_Amount";
	}
	public static abstract class EMSavingTable {
		public static final String TABLE = "Saving_Table";
		public static final String SV_ID = BaseColumns._ID;
		public static final String SV_MONTH = "Saving_Month";
		public static final String SV_YR = "Saving_Year";
		public static final String SV_REMARK = "Saving_Remark";
		public static final String SV_AMOUNT = "Saving_Amount";
	}
}
