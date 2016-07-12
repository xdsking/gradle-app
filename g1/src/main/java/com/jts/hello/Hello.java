package com.jts.hello;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import java.util.List;

/**
 * Created by xuds on 2016/7/11.
 */
public class Hello {
    public List<Object> findByPolygonWKT() throws ParseException{
        WKTReader reader = new WKTReader();
        Geometry polygon = reader.read("LINEARRING ( 295895.3238300492 2251783.230814348, 296907.69382697035 2251783.230814348, 296907.69382697035 2252680.3463808503, 295895.3238300492 2252680.3463808503, 295895.3238300492 2251783.230814348 )");
        System.out.println("Cropping envelope : " + polygon.toText());
        return null;
    }
    public static void main(String[] args) throws Exception {
        Hello a= new Hello ();
        a.findByPolygonWKT();
    }
}
