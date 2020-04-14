/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package terfaze.acts.test.abcinterfase.method1;

import com.alipay.atcs2.servicetest.base.ActsDemoApplication;
import org.testng.annotations.Test;

import com.alipay.test.acts.annotation.TestBean;
import com.alipay.test.acts.model.PrepareData;
import com.alipay.test.acts.template.ActsTestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hxyd.interfaze.AbcInterfase;

/**
 *
 * @author Yondervision
 * @version $Id: Method1ActsTest.java,v 0.1 2020-04-13 下午 11:29:17 Yondervision Exp $
 */
@SpringBootTest(classes = ActsDemoApplication.class)
public class Method1ActsTest extends ActsTestBase{

    @TestBean
    @Autowired
    protected AbcInterfase abcInterfase;

    /**
     * 说明：runTest(caseId, desc, prepareData)脚本中的process方法中的clear,prepare,execute,check四个方法如果无法满足脚本
     * 需求可以进行重写。forExample:
     * public void prepare(ActsRuntimeContext actsRuntimeContext) throws ActsTestException {
     *      userDifined();//自定义数据准备;
     *      super.prepare(actsRuntimeContext);//继承父类数据准备方法
     * }
     *
     * {@link com.hxyd.interfaze.AbcInterfase#method1()}
     */
    @Test(dataProvider = "ActsDataProvider")
    public void method1
                (String caseId, String desc, PrepareData prepareData) {
        runTest(caseId, prepareData);
    }

    public void setAbcInterfase(AbcInterfase abcInterfase) {
        this.abcInterfase = abcInterfase;
    }

}
