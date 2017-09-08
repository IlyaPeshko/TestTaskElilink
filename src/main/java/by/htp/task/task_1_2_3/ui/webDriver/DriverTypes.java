package by.htp.task.task_1_2_3.ui.webDriver;


public enum DriverTypes {
    FIREFOX ("firefox"), IE ("internet explorer"), GC_MAC64("google chrome mac64"), GC_WIN32("google chrome win32");

    private String driverName;

    DriverTypes(String driverName){
        this.driverName = driverName;
    }

    public String getDriverName() {
        return this.driverName;
    }

}
