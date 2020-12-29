package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile automationpractice_tester : Adres strony automationpractice</p>
     */
    public static Object url
     
    /**
     * <p>Profile automationpractice_tester : Nazwa emaila u&#380;ytkownika kt&oacute;ry jest zarejestrowany w bazie serwisu</p>
     */
    public static Object registered_user_email
     
    /**
     * <p>Profile automationpractice_tester : Nazwa emaila u&#380;ytkownika kt&oacute;ry jest nie zarejestrowany w bazie serwisu</p>
     */
    public static Object unregistered_user_email
     
    /**
     * <p>Profile automationpractice_tester : Poprawne has&#322;o u&#380;ytkownika kt&oacute;ry jest zarejestrowany</p>
     */
    public static Object correct_user_pwd
     
    /**
     * <p>Profile automationpractice_tester : Niepoprawne has&#322;o u&#380;ytkownika kt&oacute;ry jest zarejestrowany</p>
     */
    public static Object incorrect_user_pwd
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            url = selectedVariables['url']
            registered_user_email = selectedVariables['registered_user_email']
            unregistered_user_email = selectedVariables['unregistered_user_email']
            correct_user_pwd = selectedVariables['correct_user_pwd']
            incorrect_user_pwd = selectedVariables['incorrect_user_pwd']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
