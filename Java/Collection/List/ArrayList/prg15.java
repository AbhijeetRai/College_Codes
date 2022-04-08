import java.util.*;

class Instagram {

	public static void main(String[] args) {
		
		ArrayList<Integer> followers = new ArrayList<Integer> ();

		followers.add(11); 
		followers.add(12);
		followers.add(13);
		followers.add(11);
		followers.add(14);
		followers.add(13);

		ArrayList<Integer> blockList = new ArrayList<Integer> ();

		blockList.add(11);
		blockList.add(13);

		ArrayList<Integer> newFollowers = new ArrayList<Integer> ();

		Iterator followerIterator = followers.iterator();
		ListIterator blockListIterator = blockList.listIterator();
		/** Count - To keep an eye on list, move back if cursor points at end of list, 
		     move forward if cursor at beginning of list*/
		int count = 0;

		while(followerIterator.hasNext()) {
			
			int flag = 0;
			int follower = (Integer)followerIterator.next();

			if (count % 2 == 0) {

				while(blockListIterator.hasNext()) {

					int blocked = (Integer)blockListIterator.next();

					if(blocked == follower) {

						flag = 1;
					}
				}
				count ++;
			}
			/** reached end of list in if, now moving back*/
			else {

				while(blockListIterator.hasPrevious()) {

					int blocked = (Integer)blockListIterator.previous();

					if(blocked == follower) {

						flag = 1;
					}
				}
				count ++;
			}

			if(flag == 0) {

				newFollowers.add(follower);
			}
		}

		System.out.println("MyFollowers : " + followers);
		System.out.println("Blocked Follower : " + blockList);
		System.out.println("New FollowerList : " + newFollowers);
	}
}