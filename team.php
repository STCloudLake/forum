<?php
header("content-Type: text/html; charset=UTF-8");
if (get_magic_quotes_gpc()) foreach ($_POST as $k => $v) $_POST[$k] = stripslashes($v);
?>

<html>
<div id="top">
    <h1>
        <a href="http://10.118.246.242:8080">
            <img id="game" src="./team_image/gameicon.png" title="游戏区">
        </a>
        <img id="logo1" src="./team_image/logo1.png">
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp在线接口文档传输区
        <button id="btn" type="button" onclick="javascript:location.reload()">刷新</button>
        <a href="./cn">
            <img id="logo2" src="./team_image/homeicon.png" title="测试区">
        </a>
    </h1>
</div>
<div id="left">
    <form method="POST">
        <strong>保存文件名 :</strong><input id="inputFileName" type="text" name="file"
                                       value="<? echo str_replace('\\', '/', "") ?>">
        <br><br>
        <textarea name="text"></textarea>
        <br><br>
        <button id="submitBtn" type="submit" name="submit">上传</button>
        <p style="display: inline;position: absolute;float: left;left: 28%; top: 49%;width: 65%;">
            文件名无需加后缀，自动保存为json文件。文件名禁止使用中文！若要删除文件，上传同名空文件即可。</p>
        <?php
        $absolutePath = "E:/Safe/phpstudy_pro/WWW/postwoman/team/";
        if (isset($_POST['file']) && ($_POST['file'] !== null) && ($_POST['file'] !== "")) {
            $_POST['file'] = iconv("UTF-8", "GBK", $_POST['file']);
            $fp = @fopen($absolutePath . $_POST['file'] . ".json", 'wb');
            @fwrite($fp, $_POST['text']);
            @fclose($fp);
        }
        if (file_exists($absolutePath . $_POST['file'] . ".json") && filesize($absolutePath . $_POST['file'] . ".json") == 0) {
            unlink($absolutePath . $_POST['file'] . ".json");
        }
        if (isset($_POST['submit'])) {
            header("Location: ./team.php");
            exit;
        }
        ?>
    </form>

    <h4>文件列表：</h4>
    <?php
    echo "<table>";
    $config_basedir_file = "./team/";
    if ($handle = opendir("./team/")) {
        while (1) {
            $ufile = readdir($handle);
            if ($ufile == "") break;
            if (($ufile != ".") & ($ufile != "..")) {
                $tfile = iconv('UTF-8', 'GBK', $ufile);
                $ctime = filectime($config_basedir_file . $tfile);
                echo "<tr><td class='col1'><li><a onclick='getShowFileName(this);' style='text-decoration: none;' href='";
                echo $config_basedir_file . $tfile . "' target='show'>" . $tfile . "</a></td><td class='col2'>";
                echo date("Y-m-d H:i:s", $ctime) . "</td><td class='col3'><a href='./team/" . $tfile;
                echo "' style='text-decoration: none;' download='./team/" . $tfile . "'>下载</a></td></li></tr>";
            }
        }
    }
    echo "</table>";
    ?>
</div>
<div id="right">
    <h4 style="display:inline;">文件预览：<p id="showFileName" style="display: inline"></p></h4>
    <br><br>
    <iframe id="frame" name="show" src="./README.txt"></iframe>
</div>
<script type="text/javascript">
    function getShowFileName(obj) {
        var fileName = obj.href;
        fileName = fileName.substring(fileName.lastIndexOf('/') + 1, fileName.length);
        document.getElementById("showFileName").innerHTML = fileName;
    }
</script>

<style>
    body {
        margin: 0;
        height: 100%
    }

    html {
        height: 100%
    }

    #top {
        position: relative;
        height: 6%;
        background-color: burlywood;
    }

    div h1 {
        text-align: center;
    }

    #game {
        position: absolute;
        float: left;
        top: 6px;
        left: 1%;
        border-radius: 50%;
        overflow: hidden;
        width: 36px;
    }

    #logo1 {
        position: absolute;
        float: left;
        top: 6px;
        left: 38%;
        border-radius: 50%;
        overflow: hidden;
        width: 36px;
    }

    #logo2 {
        position: absolute;
        float: right;
        top: 6px;
        right: 16px;
        border-radius: 50%;
        overflow: hidden;
        width: 36px;
    }

    #left {
        position: relative;
        top: 0;
        left: 0;
        width: 50%;
        height: 94%;
        display: inline;
        float: left;
        overflow-y: scroll;
        background-color: #CCCCCC;
    }

    #inputFileName {
        width: 80%;
    }

    textarea {
        font-size: 120%;
        border: solid black 2px;
        width: 92%;
        height: 40%;
        display: block;
        resize: none;
    }

    #submitBtn {
        position: relative;
        left: 2%;
        display: inline;
    }

    .col1 {
        width: 40%;
    }

    .col2 {
        width: auto;
        text-align: center;
    }

    .col3 {
        width: 50px;
        text-align: left;
    }

    #right {
        position: relative;
        margin-left: auto;
        width: 50%;
        height: 94%;
        float: right;
        overflow-y: scroll;
        background-color: antiquewhite;
    }

    iframe {
        border: solid black 2px;
        width: 92%;
        height: 40%;
        display: block;
    }

    #btn {
        position: relative;
        float: right;
        right: 70px;
        top: 8px;
        text-align: center;
        width: 5%;
        padding: 5px;
        border-radius: 5px;
        border: solid blue 1px;
        background-color: lightblue;
        box-shadow: blue -2px -2px inset;
    }

    #btn:hover {
        text-align: center;
        width: 5%;
        padding: 5px;
        border-radius: 5px;
        border: solid blue 1px;
        background-color: lightcoral;
        box-shadow: blue -2px -2px inset;
    }

    [type=submit], [type=reset] {
        width: 25%;
        padding: 10px;
        border-radius: 10px;
        border: solid blue 1px;
        background-color: lightblue;
        box-shadow: blue -2px -2px inset;
    }

    [type=submit]:hover, [type=reset]:hover {
        width: 25%;
        padding: 10px;
        border-radius: 10px;
        border: solid blue 1px;
        background-color: lightcoral;
        box-shadow: blue -2px -2px inset;
    }
</style>

</html>


