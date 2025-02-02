package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`off-topic`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`too heated`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.spam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mergedby extends StObject {
  
  var _links: Reviewcomments
  
  /** @enum {string|null} */
  var active_lock_reason: resolved | `off-topic` | (`too heated`) | spam | _empty | Null
  
  var additions: js.UndefOr[Double] = js.undefined
  
  /** User */
  var assignee: Organizationsurl | Null
  
  var assignees: js.Array[Organizationsurl | Null]
  
  /**
    * AuthorAssociation
    * @description How the author is associated with the repository.
    * @enum {string}
    */
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /**
    * PullRequestAutoMerge
    * @description The status of auto merging a pull request.
    */
  var auto_merge: Mergemethod | Null
  
  var base: LabelRefRepoSha
  
  var body: String | Null
  
  var changed_files: js.UndefOr[Double] = js.undefined
  
  /** Format: date-time */
  var closed_at: String | Null
  
  var comments: js.UndefOr[Double] = js.undefined
  
  /** Format: uri */
  var comments_url: String
  
  var commits: js.UndefOr[Double] = js.undefined
  
  /** Format: uri */
  var commits_url: String
  
  /** Format: date-time */
  var created_at: String
  
  var deletions: js.UndefOr[Double] = js.undefined
  
  /** Format: uri */
  var diff_url: String
  
  /** @description Indicates whether or not the pull request is a draft. */
  var draft: Boolean
  
  var head: LabelRefRepoSha
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  /** Format: uri */
  var issue_url: String
  
  var labels: js.Array[ColorDefaultDescription]
  
  var locked: Boolean
  
  /** @description Indicates whether maintainers can modify the pull request. */
  var maintainer_can_modify: js.UndefOr[Boolean] = js.undefined
  
  var merge_commit_sha: String | Null
  
  var mergeable: js.UndefOr[Boolean | Null] = js.undefined
  
  var mergeable_state: js.UndefOr[String] = js.undefined
  
  var merged: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Format: date-time */
  var merged_at: String | Null
  
  /** User */
  var merged_by: js.UndefOr[Organizationsurl | Null] = js.undefined
  
  /**
    * Milestone
    * @description A collection of related issues and pull requests.
    */
  var milestone: Openissues | Null
  
  var node_id: String
  
  /** @description Number uniquely identifying the pull request within its repository. */
  var number: Double
  
  /** Format: uri */
  var patch_url: String
  
  var rebaseable: js.UndefOr[Boolean | Null] = js.undefined
  
  var requested_reviewers: js.Array[OneOf[js.Tuple2[Deleted | Null, NodeidParent]]]
  
  var requested_teams: js.Array[NodeidParent]
  
  /** Format: uri-template */
  var review_comment_url: String
  
  var review_comments: js.UndefOr[Double] = js.undefined
  
  /** Format: uri */
  var review_comments_url: String
  
  /**
    * @description State of this Pull Request. Either `open` or `closed`.
    * @enum {string}
    */
  var state: open | closed
  
  /** Format: uri */
  var statuses_url: String
  
  /** @description The title of the pull request. */
  var title: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
  
  /** User */
  var user: Organizationsurl | Null
}
object Mergedby {
  
  inline def apply(
    _links: Reviewcomments,
    assignees: js.Array[Organizationsurl | Null],
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    base: LabelRefRepoSha,
    comments_url: String,
    commits_url: String,
    created_at: String,
    diff_url: String,
    draft: Boolean,
    head: LabelRefRepoSha,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[ColorDefaultDescription],
    locked: Boolean,
    node_id: String,
    number: Double,
    patch_url: String,
    requested_reviewers: js.Array[OneOf[js.Tuple2[Deleted | Null, NodeidParent]]],
    requested_teams: js.Array[NodeidParent],
    review_comment_url: String,
    review_comments_url: String,
    state: open | closed,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String
  ): Mergedby = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], requested_reviewers = requested_reviewers.asInstanceOf[js.Any], requested_teams = requested_teams.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], active_lock_reason = null, assignee = null, auto_merge = null, body = null, closed_at = null, merge_commit_sha = null, merged_at = null, milestone = null, user = null)
    __obj.asInstanceOf[Mergedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mergedby] (val x: Self) extends AnyVal {
    
    inline def setActive_lock_reason(value: resolved | `off-topic` | (`too heated`) | spam | _empty): Self = StObject.set(x, "active_lock_reason", value.asInstanceOf[js.Any])
    
    inline def setActive_lock_reasonNull: Self = StObject.set(x, "active_lock_reason", null)
    
    inline def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    inline def setAssignee(value: Organizationsurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssignees(value: js.Array[Organizationsurl | Null]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesVarargs(value: (Organizationsurl | Null)*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setAuto_merge(value: Mergemethod): Self = StObject.set(x, "auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAuto_mergeNull: Self = StObject.set(x, "auto_merge", null)
    
    inline def setBase(value: LabelRefRepoSha): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setChanged_files(value: Double): Self = StObject.set(x, "changed_files", value.asInstanceOf[js.Any])
    
    inline def setChanged_filesUndefined: Self = StObject.set(x, "changed_files", js.undefined)
    
    inline def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
    
    inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: Double): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setCommitsUndefined: Self = StObject.set(x, "commits", js.undefined)
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    inline def setDeletionsUndefined: Self = StObject.set(x, "deletions", js.undefined)
    
    inline def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setHead(value: LabelRefRepoSha): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssue_url(value: String): Self = StObject.set(x, "issue_url", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[ColorDefaultDescription]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: ColorDefaultDescription*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setMaintainer_can_modify(value: Boolean): Self = StObject.set(x, "maintainer_can_modify", value.asInstanceOf[js.Any])
    
    inline def setMaintainer_can_modifyUndefined: Self = StObject.set(x, "maintainer_can_modify", js.undefined)
    
    inline def setMerge_commit_sha(value: String): Self = StObject.set(x, "merge_commit_sha", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_shaNull: Self = StObject.set(x, "merge_commit_sha", null)
    
    inline def setMergeable(value: Boolean): Self = StObject.set(x, "mergeable", value.asInstanceOf[js.Any])
    
    inline def setMergeableNull: Self = StObject.set(x, "mergeable", null)
    
    inline def setMergeableUndefined: Self = StObject.set(x, "mergeable", js.undefined)
    
    inline def setMergeable_state(value: String): Self = StObject.set(x, "mergeable_state", value.asInstanceOf[js.Any])
    
    inline def setMergeable_stateUndefined: Self = StObject.set(x, "mergeable_state", js.undefined)
    
    inline def setMerged(value: Boolean): Self = StObject.set(x, "merged", value.asInstanceOf[js.Any])
    
    inline def setMergedNull: Self = StObject.set(x, "merged", null)
    
    inline def setMergedUndefined: Self = StObject.set(x, "merged", js.undefined)
    
    inline def setMerged_at(value: String): Self = StObject.set(x, "merged_at", value.asInstanceOf[js.Any])
    
    inline def setMerged_atNull: Self = StObject.set(x, "merged_at", null)
    
    inline def setMerged_by(value: Organizationsurl): Self = StObject.set(x, "merged_by", value.asInstanceOf[js.Any])
    
    inline def setMerged_byNull: Self = StObject.set(x, "merged_by", null)
    
    inline def setMerged_byUndefined: Self = StObject.set(x, "merged_by", js.undefined)
    
    inline def setMilestone(value: Openissues): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNull: Self = StObject.set(x, "milestone", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    inline def setRebaseable(value: Boolean): Self = StObject.set(x, "rebaseable", value.asInstanceOf[js.Any])
    
    inline def setRebaseableNull: Self = StObject.set(x, "rebaseable", null)
    
    inline def setRebaseableUndefined: Self = StObject.set(x, "rebaseable", js.undefined)
    
    inline def setRequested_reviewers(value: js.Array[OneOf[js.Tuple2[Deleted | Null, NodeidParent]]]): Self = StObject.set(x, "requested_reviewers", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewersVarargs(value: (OneOf[js.Tuple2[Deleted | Null, NodeidParent]])*): Self = StObject.set(x, "requested_reviewers", js.Array(value*))
    
    inline def setRequested_teams(value: js.Array[NodeidParent]): Self = StObject.set(x, "requested_teams", value.asInstanceOf[js.Any])
    
    inline def setRequested_teamsVarargs(value: NodeidParent*): Self = StObject.set(x, "requested_teams", js.Array(value*))
    
    inline def setReview_comment_url(value: String): Self = StObject.set(x, "review_comment_url", value.asInstanceOf[js.Any])
    
    inline def setReview_comments(value: Double): Self = StObject.set(x, "review_comments", value.asInstanceOf[js.Any])
    
    inline def setReview_commentsUndefined: Self = StObject.set(x, "review_comments", js.undefined)
    
    inline def setReview_comments_url(value: String): Self = StObject.set(x, "review_comments_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Organizationsurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def set_links(value: Reviewcomments): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
