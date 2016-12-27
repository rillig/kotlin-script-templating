import io.spring.demo.User
import io.spring.demo.line

// TODO Use foo instead of bindings["foo"] when https://youtrack.jetbrains.com/issue/KT-15125 will be fixed
// TODO Discuss with Kotlin team how to avoid undefined bind variable repported as errors
"""
<html>
<body>
<h1>Title : ${bindings["title"]}</h1>
<ul>
	${(bindings["users"] as List<User>).line{ "<li>User ${it.firstname} ${it.lastname}</li>" }}
</ul>
</html>
"""
