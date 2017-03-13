package de.diedavids.cuba.console.sql

import de.diedavids.cuba.console.diagnose.DiagnoseExecution

interface SqlDiagnoseService {
    String NAME = 'console_SqlConsoleService'

    SqlSelectResult runSqlDiagnose(String sqlString)
    DiagnoseExecution runSqlDiagnose(DiagnoseExecution diagnoseExecution)
}