<%@ page import="com.link.Topic" %>
<!doctype html>
<html>
<head>
    <asset:javascript src="jquery-3.3.1.min.js"></asset:javascript>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
</head>

<body>
<div class="row">
    <div class="col-md-8"></div>
    <ul class="nav">
        <li class="nav-item">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                Create Topic
            </button>
            <!-- The Modal -->
            <div class="modal" id="myModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <g:form controller="topic" action="createTopic">
                            <div class="modal-header">

                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <br>
                            </div>

                            <div class="modal-body">
                                <h4 class="modal-title">Topic Name</h4>
                                <g:textField name="name"></g:textField>
                                <g:select name="visibility" from="${com.link.ENUMS.Visibility}"></g:select>
                                <br>
                            </div>

                            <div class="modal-footer">
                                <g:submitButton name="Save"></g:submitButton>
                                <g:submitButton name="Cancel" data-dismiss="modal"></g:submitButton>
                            </div>
                        </g:form>

                    </div>
                </div>
            </div>
        </li>
        <li class="nav-item">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal1">
                Document
            </button>
            <!-- The Modal -->
            <div class="modal" id="myModal1">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <g:form controller="documentResource" action="share">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                            </div>

                            <div class="modal-body">
                                Document* : <g:textField name="filePath"></g:textField>
                                <input type="file" value="browse">
                                <br><br>
                                Description* :<g:textArea name="description"></g:textArea>
                                <br><br>

                                Topic* :<g:select name="topic" from="${topics}" optionKey="id"
                                                  optionValue="name"></g:select>
                            </div>


                            <div class="modal-footer">
                                <g:submitButton name="Share"></g:submitButton>
                                <g:submitButton name="Cancel" data-dismiss="modal"></g:submitButton>
                            </div>
                        </g:form>

                    </div>
                </div>
            </div>
        </li>
        <li class="nav-item">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal2">
                Link
            </button>
            <!-- The Modal -->
            <div class="modal" id="myModal2">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <g:form controller="linkResourse" action="share">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                            </div>

                            <div class="modal-body">
                                Link* : <g:textField name="url"></g:textField>
                                <br><br>
                                Description* :<g:textArea name="description"></g:textArea>
                                <br><br>
                                Topic* :<g:select name="topic" from="${topics}" optionKey="id"
                                                  optionValue="name"></g:select>
                            </div>


                            <div class="modal-footer">
                                <g:submitButton name="Share"></g:submitButton>
                                <g:submitButton name="Cancel" data-dismiss="modal"></g:submitButton>
                            </div>
                        </g:form>

                    </div>
                </div>
            </div>
        </li>

        <div align="right">
            <sec:ifLoggedIn>
                <g:link controller="logout">Logout</g:link>
            </sec:ifLoggedIn>
        </div>

    </ul>
</div>


<br>

<div class="col-md-4">
    <div class="jumbotron">

        <div align="center">
            <h3>${user.firstName}</h3>

            <sec:loggedInUserInfo field="username"/>
        </div>
        <br>

        <div class="row">
            <div class="col-md-2">Topics</div>

            <div class="col-md-2">Subscription</div>
        </div>

        <div class="row">
            <div class="col-md-2">
                <button type="button" class="transparent-pattern" data-toggle="modal" data-target="#userTopic">
                    ${topicCount}
                </button>
            </div>

            <div class="col-md-2">
                <button type="button" class="transparent-pattern" data-toggle="modal" data-target="#subscribedTopic">
                    ${subcriptionCount}
                </button>

            </div>

        </div>
    </div>
</div>


<div class="modal" id="subscribedTopic">
    <div class="modal-dialog">
        <div class="modal-content">
            %{--<g:form controller="linkResourse" action="share">--}%
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <g:each in="${topicSubscribed}" var="topicSubscribe">
                    <g:form controller="subscription" action="subscribe">
                        <div class="card">
                            <div class="card-body">
                                Topic Name: ${topicSubscribe.topic.name}
                                <g:hiddenField name="topicId" value="${topicSubscribe.topic.id}"/>
                                <g:select name="seriousness" from="${com.link.ENUMS.Seriousness}"></g:select>
                                %{--<g:select name="Visibility" from="${topics.visibility}"></g:select>--}%
                                <g:submitButton name="Subscription"></g:submitButton>

                            </div>
                        </div>
                    </g:form>
                </g:each>
            </div>

        </div>
    </div>
</div>

<div class="modal" id="userTopic">
    <div class="modal-dialog">
        <div class="modal-content">
            %{--<g:form controller="linkResourse" action="share">--}%
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <g:each in="${topicCreatedByUser}" var="topicCreatedBy">
                    <g:form controller="subscription" action="subscribe">
                        <div class="card">
                            <div class="card-body">
                                Topic Name: ${topicCreatedBy.name}

                                <g:select name="seriousness" from="${com.link.ENUMS.Seriousness}"></g:select>
                                <g:select name="Visibility" from="${topicCreatedBy.visibility}"></g:select>
                                <g:submitButton name="Subscription"></g:submitButton>

                            </div>
                        </div>
                    </g:form>
                </g:each>
            </div>

        </div>
    </div>
</div>


<div class="col-md-6">
<g:each in="${topicCreatedByUser}" var="topic" status="count">
    <g:form controller="subscription" action="subscribe">
        <div class="card">
            <div class="card-body">
                Topic Name: ${topic.name}
                <g:hiddenField name="topicId" value="${topic.id}"/>
                %{--<g:set var="dropdownValue" value="dropdown+${counter}"></g:set>--}%
                <g:select name="seriousness" from="${com.link.ENUMS.Seriousness}"></g:select>
                %{--<g:select name="Visibility" from="${topic.visibility}"></g:select>--}%
                <g:submitButton name="Subscribe" ></g:submitButton>
            </div>
        </div>

    </g:form>
</g:each>
</div>




</body>

</html>