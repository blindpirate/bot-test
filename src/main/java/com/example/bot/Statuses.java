package com.example.bot;


import java.util.List;

public class Statuses {

    /**
     * state : success
     * statuses : [{"url":"https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e","avatar_url":"https://github.com/images/error/hubot_happy.gif","id":1,"node_id":"MDY6U3RhdHVzMQ==","state":"success","description":"Build has completed successfully","target_url":"https://ci.example.com/1000/output","context":"continuous-integration/jenkins","created_at":"2012-07-20T01:19:13Z","updated_at":"2012-07-20T01:19:13Z"},{"url":"https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e","avatar_url":"https://github.com/images/error/other_user_happy.gif","id":2,"node_id":"MDY6U3RhdHVzMg==","state":"success","description":"Testing has completed successfully","target_url":"https://ci.example.com/2000/output","context":"security/brakeman","created_at":"2012-08-20T01:19:13Z","updated_at":"2012-08-20T01:19:13Z"}]
     * sha : 6dcb09b5b57875f334f61aebed695e2e4193db5e
     * total_count : 2
     * repository : {"id":1296269,"node_id":"MDEwOlJlcG9zaXRvcnkxMjk2MjY5","name":"Hello-World","full_name":"octocat/Hello-World","owner":{"login":"octocat","id":1,"node_id":"MDQ6VXNlcjE=","avatar_url":"https://github.com/images/error/octocat_happy.gif","gravatar_id":"","url":"https://api.github.com/users/octocat","html_url":"https://github.com/octocat","followers_url":"https://api.github.com/users/octocat/followers","following_url":"https://api.github.com/users/octocat/following{/other_user}","gists_url":"https://api.github.com/users/octocat/gists{/gist_id}","starred_url":"https://api.github.com/users/octocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/octocat/subscriptions","organizations_url":"https://api.github.com/users/octocat/orgs","repos_url":"https://api.github.com/users/octocat/repos","events_url":"https://api.github.com/users/octocat/events{/privacy}","received_events_url":"https://api.github.com/users/octocat/received_events","type":"User","site_admin":false},"private":false,"html_url":"https://github.com/octocat/Hello-World","description":"This your first repo!","fork":false,"url":"https://api.github.com/repos/octocat/Hello-World","archive_url":"http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}","assignees_url":"http://api.github.com/repos/octocat/Hello-World/assignees{/user}","blobs_url":"http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}","branches_url":"http://api.github.com/repos/octocat/Hello-World/branches{/branch}","collaborators_url":"http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}","comments_url":"http://api.github.com/repos/octocat/Hello-World/comments{/number}","commits_url":"http://api.github.com/repos/octocat/Hello-World/commits{/sha}","compare_url":"http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}","contents_url":"http://api.github.com/repos/octocat/Hello-World/contents/{+path}","contributors_url":"http://api.github.com/repos/octocat/Hello-World/contributors","deployments_url":"http://api.github.com/repos/octocat/Hello-World/deployments","downloads_url":"http://api.github.com/repos/octocat/Hello-World/downloads","events_url":"http://api.github.com/repos/octocat/Hello-World/events","forks_url":"http://api.github.com/repos/octocat/Hello-World/forks","git_commits_url":"http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}","git_refs_url":"http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}","git_tags_url":"http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}","git_url":"git:github.com/octocat/Hello-World.git","issue_comment_url":"http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}","issue_events_url":"http://api.github.com/repos/octocat/Hello-World/issues/events{/number}","issues_url":"http://api.github.com/repos/octocat/Hello-World/issues{/number}","keys_url":"http://api.github.com/repos/octocat/Hello-World/keys{/key_id}","labels_url":"http://api.github.com/repos/octocat/Hello-World/labels{/name}","languages_url":"http://api.github.com/repos/octocat/Hello-World/languages","merges_url":"http://api.github.com/repos/octocat/Hello-World/merges","milestones_url":"http://api.github.com/repos/octocat/Hello-World/milestones{/number}","notifications_url":"http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}","pulls_url":"http://api.github.com/repos/octocat/Hello-World/pulls{/number}","releases_url":"http://api.github.com/repos/octocat/Hello-World/releases{/id}","ssh_url":"git@github.com:octocat/Hello-World.git","stargazers_url":"http://api.github.com/repos/octocat/Hello-World/stargazers","statuses_url":"http://api.github.com/repos/octocat/Hello-World/statuses/{sha}","subscribers_url":"http://api.github.com/repos/octocat/Hello-World/subscribers","subscription_url":"http://api.github.com/repos/octocat/Hello-World/subscription","tags_url":"http://api.github.com/repos/octocat/Hello-World/tags","teams_url":"http://api.github.com/repos/octocat/Hello-World/teams","trees_url":"http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}"}
     * commit_url : https://api.github.com/repos/octocat/Hello-World/6dcb09b5b57875f334f61aebed695e2e4193db5e
     * url : https://api.github.com/repos/octocat/Hello-World/6dcb09b5b57875f334f61aebed695e2e4193db5e/status
     */

    private String state;
    private String sha;
    private int total_count;
    private RepositoryBean repository;
    private String commit_url;
    private String url;
    private List<StatusesBean> statuses;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public RepositoryBean getRepository() {
        return repository;
    }

    public void setRepository(RepositoryBean repository) {
        this.repository = repository;
    }

    public String getCommit_url() {
        return commit_url;
    }

    public void setCommit_url(String commit_url) {
        this.commit_url = commit_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<StatusesBean> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<StatusesBean> statuses) {
        this.statuses = statuses;
    }

    public static class RepositoryBean {
        /**
         * id : 1296269
         * node_id : MDEwOlJlcG9zaXRvcnkxMjk2MjY5
         * name : Hello-World
         * full_name : octocat/Hello-World
         * owner : {"login":"octocat","id":1,"node_id":"MDQ6VXNlcjE=","avatar_url":"https://github.com/images/error/octocat_happy.gif","gravatar_id":"","url":"https://api.github.com/users/octocat","html_url":"https://github.com/octocat","followers_url":"https://api.github.com/users/octocat/followers","following_url":"https://api.github.com/users/octocat/following{/other_user}","gists_url":"https://api.github.com/users/octocat/gists{/gist_id}","starred_url":"https://api.github.com/users/octocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/octocat/subscriptions","organizations_url":"https://api.github.com/users/octocat/orgs","repos_url":"https://api.github.com/users/octocat/repos","events_url":"https://api.github.com/users/octocat/events{/privacy}","received_events_url":"https://api.github.com/users/octocat/received_events","type":"User","site_admin":false}
         * private : false
         * html_url : https://github.com/octocat/Hello-World
         * description : This your first repo!
         * fork : false
         * url : https://api.github.com/repos/octocat/Hello-World
         * archive_url : http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}
         * assignees_url : http://api.github.com/repos/octocat/Hello-World/assignees{/user}
         * blobs_url : http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}
         * branches_url : http://api.github.com/repos/octocat/Hello-World/branches{/branch}
         * collaborators_url : http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}
         * comments_url : http://api.github.com/repos/octocat/Hello-World/comments{/number}
         * commits_url : http://api.github.com/repos/octocat/Hello-World/commits{/sha}
         * compare_url : http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}
         * contents_url : http://api.github.com/repos/octocat/Hello-World/contents/{+path}
         * contributors_url : http://api.github.com/repos/octocat/Hello-World/contributors
         * deployments_url : http://api.github.com/repos/octocat/Hello-World/deployments
         * downloads_url : http://api.github.com/repos/octocat/Hello-World/downloads
         * events_url : http://api.github.com/repos/octocat/Hello-World/events
         * forks_url : http://api.github.com/repos/octocat/Hello-World/forks
         * git_commits_url : http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}
         * git_refs_url : http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}
         * git_tags_url : http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}
         * git_url : git:github.com/octocat/Hello-World.git
         * issue_comment_url : http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}
         * issue_events_url : http://api.github.com/repos/octocat/Hello-World/issues/events{/number}
         * issues_url : http://api.github.com/repos/octocat/Hello-World/issues{/number}
         * keys_url : http://api.github.com/repos/octocat/Hello-World/keys{/key_id}
         * labels_url : http://api.github.com/repos/octocat/Hello-World/labels{/name}
         * languages_url : http://api.github.com/repos/octocat/Hello-World/languages
         * merges_url : http://api.github.com/repos/octocat/Hello-World/merges
         * milestones_url : http://api.github.com/repos/octocat/Hello-World/milestones{/number}
         * notifications_url : http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}
         * pulls_url : http://api.github.com/repos/octocat/Hello-World/pulls{/number}
         * releases_url : http://api.github.com/repos/octocat/Hello-World/releases{/id}
         * ssh_url : git@github.com:octocat/Hello-World.git
         * stargazers_url : http://api.github.com/repos/octocat/Hello-World/stargazers
         * statuses_url : http://api.github.com/repos/octocat/Hello-World/statuses/{sha}
         * subscribers_url : http://api.github.com/repos/octocat/Hello-World/subscribers
         * subscription_url : http://api.github.com/repos/octocat/Hello-World/subscription
         * tags_url : http://api.github.com/repos/octocat/Hello-World/tags
         * teams_url : http://api.github.com/repos/octocat/Hello-World/teams
         * trees_url : http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}
         */

        private int id;
        private String node_id;
        private String name;
        private String full_name;
        private OwnerBean owner;
        private boolean privateX;
        private String html_url;
        private String description;
        private boolean fork;
        private String url;
        private String archive_url;
        private String assignees_url;
        private String blobs_url;
        private String branches_url;
        private String collaborators_url;
        private String comments_url;
        private String commits_url;
        private String compare_url;
        private String contents_url;
        private String contributors_url;
        private String deployments_url;
        private String downloads_url;
        private String events_url;
        private String forks_url;
        private String git_commits_url;
        private String git_refs_url;
        private String git_tags_url;
        private String git_url;
        private String issue_comment_url;
        private String issue_events_url;
        private String issues_url;
        private String keys_url;
        private String labels_url;
        private String languages_url;
        private String merges_url;
        private String milestones_url;
        private String notifications_url;
        private String pulls_url;
        private String releases_url;
        private String ssh_url;
        private String stargazers_url;
        private String statuses_url;
        private String subscribers_url;
        private String subscription_url;
        private String tags_url;
        private String teams_url;
        private String trees_url;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public OwnerBean getOwner() {
            return owner;
        }

        public void setOwner(OwnerBean owner) {
            this.owner = owner;
        }

        public boolean isPrivateX() {
            return privateX;
        }

        public void setPrivateX(boolean privateX) {
            this.privateX = privateX;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isFork() {
            return fork;
        }

        public void setFork(boolean fork) {
            this.fork = fork;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getArchive_url() {
            return archive_url;
        }

        public void setArchive_url(String archive_url) {
            this.archive_url = archive_url;
        }

        public String getAssignees_url() {
            return assignees_url;
        }

        public void setAssignees_url(String assignees_url) {
            this.assignees_url = assignees_url;
        }

        public String getBlobs_url() {
            return blobs_url;
        }

        public void setBlobs_url(String blobs_url) {
            this.blobs_url = blobs_url;
        }

        public String getBranches_url() {
            return branches_url;
        }

        public void setBranches_url(String branches_url) {
            this.branches_url = branches_url;
        }

        public String getCollaborators_url() {
            return collaborators_url;
        }

        public void setCollaborators_url(String collaborators_url) {
            this.collaborators_url = collaborators_url;
        }

        public String getComments_url() {
            return comments_url;
        }

        public void setComments_url(String comments_url) {
            this.comments_url = comments_url;
        }

        public String getCommits_url() {
            return commits_url;
        }

        public void setCommits_url(String commits_url) {
            this.commits_url = commits_url;
        }

        public String getCompare_url() {
            return compare_url;
        }

        public void setCompare_url(String compare_url) {
            this.compare_url = compare_url;
        }

        public String getContents_url() {
            return contents_url;
        }

        public void setContents_url(String contents_url) {
            this.contents_url = contents_url;
        }

        public String getContributors_url() {
            return contributors_url;
        }

        public void setContributors_url(String contributors_url) {
            this.contributors_url = contributors_url;
        }

        public String getDeployments_url() {
            return deployments_url;
        }

        public void setDeployments_url(String deployments_url) {
            this.deployments_url = deployments_url;
        }

        public String getDownloads_url() {
            return downloads_url;
        }

        public void setDownloads_url(String downloads_url) {
            this.downloads_url = downloads_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getForks_url() {
            return forks_url;
        }

        public void setForks_url(String forks_url) {
            this.forks_url = forks_url;
        }

        public String getGit_commits_url() {
            return git_commits_url;
        }

        public void setGit_commits_url(String git_commits_url) {
            this.git_commits_url = git_commits_url;
        }

        public String getGit_refs_url() {
            return git_refs_url;
        }

        public void setGit_refs_url(String git_refs_url) {
            this.git_refs_url = git_refs_url;
        }

        public String getGit_tags_url() {
            return git_tags_url;
        }

        public void setGit_tags_url(String git_tags_url) {
            this.git_tags_url = git_tags_url;
        }

        public String getGit_url() {
            return git_url;
        }

        public void setGit_url(String git_url) {
            this.git_url = git_url;
        }

        public String getIssue_comment_url() {
            return issue_comment_url;
        }

        public void setIssue_comment_url(String issue_comment_url) {
            this.issue_comment_url = issue_comment_url;
        }

        public String getIssue_events_url() {
            return issue_events_url;
        }

        public void setIssue_events_url(String issue_events_url) {
            this.issue_events_url = issue_events_url;
        }

        public String getIssues_url() {
            return issues_url;
        }

        public void setIssues_url(String issues_url) {
            this.issues_url = issues_url;
        }

        public String getKeys_url() {
            return keys_url;
        }

        public void setKeys_url(String keys_url) {
            this.keys_url = keys_url;
        }

        public String getLabels_url() {
            return labels_url;
        }

        public void setLabels_url(String labels_url) {
            this.labels_url = labels_url;
        }

        public String getLanguages_url() {
            return languages_url;
        }

        public void setLanguages_url(String languages_url) {
            this.languages_url = languages_url;
        }

        public String getMerges_url() {
            return merges_url;
        }

        public void setMerges_url(String merges_url) {
            this.merges_url = merges_url;
        }

        public String getMilestones_url() {
            return milestones_url;
        }

        public void setMilestones_url(String milestones_url) {
            this.milestones_url = milestones_url;
        }

        public String getNotifications_url() {
            return notifications_url;
        }

        public void setNotifications_url(String notifications_url) {
            this.notifications_url = notifications_url;
        }

        public String getPulls_url() {
            return pulls_url;
        }

        public void setPulls_url(String pulls_url) {
            this.pulls_url = pulls_url;
        }

        public String getReleases_url() {
            return releases_url;
        }

        public void setReleases_url(String releases_url) {
            this.releases_url = releases_url;
        }

        public String getSsh_url() {
            return ssh_url;
        }

        public void setSsh_url(String ssh_url) {
            this.ssh_url = ssh_url;
        }

        public String getStargazers_url() {
            return stargazers_url;
        }

        public void setStargazers_url(String stargazers_url) {
            this.stargazers_url = stargazers_url;
        }

        public String getStatuses_url() {
            return statuses_url;
        }

        public void setStatuses_url(String statuses_url) {
            this.statuses_url = statuses_url;
        }

        public String getSubscribers_url() {
            return subscribers_url;
        }

        public void setSubscribers_url(String subscribers_url) {
            this.subscribers_url = subscribers_url;
        }

        public String getSubscription_url() {
            return subscription_url;
        }

        public void setSubscription_url(String subscription_url) {
            this.subscription_url = subscription_url;
        }

        public String getTags_url() {
            return tags_url;
        }

        public void setTags_url(String tags_url) {
            this.tags_url = tags_url;
        }

        public String getTeams_url() {
            return teams_url;
        }

        public void setTeams_url(String teams_url) {
            this.teams_url = teams_url;
        }

        public String getTrees_url() {
            return trees_url;
        }

        public void setTrees_url(String trees_url) {
            this.trees_url = trees_url;
        }

        public static class OwnerBean {
            /**
             * login : octocat
             * id : 1
             * node_id : MDQ6VXNlcjE=
             * avatar_url : https://github.com/images/error/octocat_happy.gif
             * gravatar_id :
             * url : https://api.github.com/users/octocat
             * html_url : https://github.com/octocat
             * followers_url : https://api.github.com/users/octocat/followers
             * following_url : https://api.github.com/users/octocat/following{/other_user}
             * gists_url : https://api.github.com/users/octocat/gists{/gist_id}
             * starred_url : https://api.github.com/users/octocat/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/octocat/subscriptions
             * organizations_url : https://api.github.com/users/octocat/orgs
             * repos_url : https://api.github.com/users/octocat/repos
             * events_url : https://api.github.com/users/octocat/events{/privacy}
             * received_events_url : https://api.github.com/users/octocat/received_events
             * type : User
             * site_admin : false
             */

            private String login;
            private int id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(boolean site_admin) {
                this.site_admin = site_admin;
            }
        }
    }

    public static class StatusesBean {
        /**
         * url : https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e
         * avatar_url : https://github.com/images/error/hubot_happy.gif
         * id : 1
         * node_id : MDY6U3RhdHVzMQ==
         * state : success
         * description : Build has completed successfully
         * target_url : https://ci.example.com/1000/output
         * context : continuous-integration/jenkins
         * created_at : 2012-07-20T01:19:13Z
         * updated_at : 2012-07-20T01:19:13Z
         */

        private String url;
        private String avatar_url;
        private int id;
        private String node_id;
        private String state;
        private String description;
        private String target_url;
        private String context;
        private String created_at;
        private String updated_at;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTarget_url() {
            return target_url;
        }

        public void setTarget_url(String target_url) {
            this.target_url = target_url;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }
}
