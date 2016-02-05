<html>

  <head>
    <title>Hello, User</title>
    <script type="text/javascript" src="/js/jquery-2.2.0.min.js"></script>
    <script type="text/javascript">
      function loadingStartInput(targetElementId) {
        var dots="";
        $("#" + targetElementId).attr("loadingIntervalId", setInterval(function(){
            if(dots.length > 2) {
            dots = "";
          } else {
            dots += ".";
          }
          $("#" + targetElementId).val("Loading" + dots);
        }, 200));
      }

      function loadingStopInput(targetElementId) {
        clearInterval($("#" + targetElementId).attr("loadingIntervalId"));
        $("#" + targetElementId).val("");
      }
      
      $( document ).ready(function() {

        $("#executeButton").click(function() {
          loadingStartInput("outputSimple");
          loadingStartInput("outputRecursive");
          loadingStartInput("outputLoopAndTemp");
          
          $.getJSON( "/api/stringreverse/simple/" + encodeURIComponent($("#stringToReverse").val()), function(data, textStatus, jqXHR) {
            loadingStopInput("outputSimple");
            $("#outputSimple").val(data.reversedString);
          });
          $.getJSON( "/api/stringreverse/recursive/" + encodeURIComponent($("#stringToReverse").val()), function(data, textStatus, jqXHR) {
            loadingStopInput("outputRecursive");
            $("#outputRecursive").val(data.reversedString);
          });
          $.getJSON( "/api/stringreverse/loop/" + encodeURIComponent($("#stringToReverse").val()), function(data, textStatus, jqXHR) {
            loadingStopInput("outputLoopAndTemp");
            $("#outputLoopAndTemp").val(data.reversedString);
          });
        });

      });
      
    </script>
  </head>

  <body bgcolor="#ffffff">
    <p>The links below are direct calls to the REST endpoints</p>

    <a href="/api/stringreverse/verify">Verify</a><br/>
    <a href="/api/stringreverse/simple/abcd">Simple</a><br/>
    <a href="/api/stringreverse/recursive/abcd">Recursive</a><br/>
    <a href="/api/stringreverse/loop/abcd">Loop and Temp</a><br/>
    <br />
    <br />
    <p>You can test the REST calls yourself! Enter a string you would like to see reversed!</p>
    <br>
    <input id="stringToReverse" type="text" />
    <input id="executeButton" type="button" value="Reverse" />
    <br />
    <input id="outputSimple" type="text" disabled="true" />
    <br />
    <input id="outputRecursive" type="text" disabled="true" />
    <br />
    <input id="outputLoopAndTemp" type="text" disabled="true" />

  </body>
</html>
