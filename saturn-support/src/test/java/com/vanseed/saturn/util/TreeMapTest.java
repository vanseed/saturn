package com.vanseed.saturn.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {
    private final static Logger logger = LoggerFactory.getLogger(TreeMapTest.class);

    protected Comparator<String> versionComparator= new Comparator<String>(){
        public int compare(String s1, String s2) {
            if(s1.equalsIgnoreCase(s2)){
                return 0;
            }else{
                return s2.compareToIgnoreCase(s1);
            }
        }
    };

    @Test
    public void treemapTest() throws Exception {
        SortedMap<String, String> testMap = new TreeMap<String, String>(versionComparator);

        logger.info("start");
        testMap.put("1.0.0","v_1.0.0");
        testMap.put("1.0.2","v_1.0.2");
        testMap.put("1.1.0","v_1.1.0");
        testMap.put("1.1.2","v_1.1.2");

        for(Map.Entry<String,String> entry : testMap.entrySet()){
            logger.info(entry.getValue());
        }
        logger.info("over");
    }
}
