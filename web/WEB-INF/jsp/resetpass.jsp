<!DOCTYPE html>
<HTML>
    <HEAD>
        <TITLE> Reset Password </TITLE>
        <META charset="utf-8"/>
        <META http-equiv="X-UA-Compatible" content="IE=edge"/>
        <META name="viewport" content="width=device-width, initial-scale=1"/>

        <!---- ><LINK rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/><!---->        
        <LINK rel="stylesheet" type="text/css" href="resources/css/style_min.css"/>
        <!----><LINK rel="stylesheet" type="text/css" href="resources/css/login.css"/><!---->
        <LINK rel="stylesheet" type="text/css" href="resources/css/iconfont.css"/>

        <SCRIPT type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></SCRIPT>
        <SCRIPT src="resources/js/bootstrap.min.js"></SCRIPT>

    </HEAD>
    <BODY class="login_page">
        <NAV class="top-bar clearfix">
            <DIV class="container-fluid clearfix">
                <A class="top-bar-brand" href="#">
                    <SPAN class="atosIconFont atosIconFont-logo"></SPAN>
                </A>
                
            </DIV>
        </NAV>
        <DIV class="clearfix contentsso pki" role="main" style="margin-top: 30.25px;">
            <SECTION class="clearfix sso-box">
                <FORM id="login" action="" method="post">
                    <H3>
                        <SPAN class="atosIconFont atosIconFont-login_password"></SPAN> Your DAS: A123456
                    </H3>
                    <FIELDSET>
                        <LEGEND>Reset Password 
                            <DIV class="tooltipInfo" tabindex="0">
                                <SPAN class="icoInfo">i</SPAN>
                                <DIV>
                                    <P>
                                        <!---->If your DAS ID requires strong authentication, this option will not work.<!---->

                                    </P>
                                </DIV>
                            </DIV>
                        </LEGEND>

                        <LABEL>Password</LABEL>
                        <INPUT type="password" name="pass" id="login_pass"/>
                        <LABEL>Repeat password</LABEL>
                        <INPUT type="password" name="pass" id="login_pass"/>

                        <INPUT type="submit" value="SEND" class="btn btn-block"/>
                    </FIELDSET>
                </FORM>
            </SECTION>
        </DIV>
    </BODY>
</HTML>