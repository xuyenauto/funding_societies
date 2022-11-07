package helpers;

public class Constant {


    public static final int TIME_OUT_SECOND = Integer.parseInt(new ReadDataFile().readJsonFile("/Config.json","Constant","time_out_second"));


}
