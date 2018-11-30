<%--
  Created by IntelliJ IDEA.
  User: hongngoc
  Date: 11/30/18
  Time: 8:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <form method="post" action="/calculate">
    <h1>Simple Calculator</h1>
    <div>
      <pre>
    <fieldset>
      <legend>Calculator</legend>
      First operand:  <input type="text" name="number1"/><br>
      Operator:       <select name="operator">
      <option value="+">Addition</option>
      <option value="-">Subtraction</option>
      <option value="*">Multiplication</option>
      <option value="/">Divition</option>
    </select><br>
      Second operand: <input type="text" name="number2"/><br>
                      <button type="submit">Calculate</button><br>
    </fieldset>
        </pre>
    </div>
  </form>
  </body>
</html>
